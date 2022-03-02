package org.mdz.bavarikon.eventbrowser.service;

import java.util.*;
import org.mdz.bavarikon.eventbrowser.model.hibernate.StatusEntity;
import org.mdz.bavarikon.eventbrowser.repository.StatusRepository;
import org.mdz.bavarikon.workflow.model.extern.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusService {

  @Autowired StatusRepository statusRepository;

  @Autowired DtoService dtoService;

  public void testInsert() {
    StatusEntity statusEntity = new StatusEntity();
    statusEntity.setChain("ingest");
    statusEntity.setNumba(3);
    statusEntity.setDaet(new Date().getTime());
    statusEntity.setDetail("test detail");
    statusEntity.setItemState("fertig");
    statusEntity.setExecId(123456L);
    statusRepository.save(statusEntity);
  }

  public Set<StatusEntity> getStatus() {
    return new HashSet<StatusEntity>((Collection) statusRepository.findAll());
  }

  public List<Status> getStatusByBatchId(Long batchId, String msgType) {
    List<StatusEntity> statusEntities = statusRepository.findByExecIdAndMsgType(batchId, msgType);
    return dtoService.statusEntitiesToStatuse(statusEntities);
  }

  public List<Status> getStatusByBavId(String bavId) {
    List<StatusEntity> statusEntities = statusRepository.findByItemId(bavId);
    return dtoService.statusEntitiesToStatuse(statusEntities);
  }

  public void save(Status status) {
    StatusEntity statusEntity = dtoService.statusToSTatusEntity(status);
    statusRepository.save(statusEntity);
  }
}
