package org.mdz.bavarikon.eventbrowser.service;

import java.util.List;
import java.util.stream.Collectors;
import org.mdz.bavarikon.eventbrowser.model.hibernate.StatusEntity;
import org.mdz.bavarikon.workflow.model.extern.Status;
import org.springframework.stereotype.Service;

@Service
public class DtoService {

  public StatusEntity statusToSTatusEntity(Status status) {
    StatusEntity statusEntity = new StatusEntity();
    statusEntity.setChain(status.getChain());
    statusEntity.setStep(status.getStep());
    statusEntity.setItemId(status.getItemId());
    statusEntity.setItemState(status.getItemState());
    statusEntity.setDetail(status.getDetail());
    statusEntity.setNumba(status.getNumba());
    statusEntity.setDaet(status.getDaet());
    statusEntity.setMsgType(status.getMsgType());
    statusEntity.setExecId(status.getExecId());

    return statusEntity;
  }

  public Status statusEntityToSTatus(StatusEntity statusEntity) {
    Status status = new Status();
    status.setChain(statusEntity.getChain());
    status.setStep(statusEntity.getStep());
    status.setItemId(statusEntity.getItemId());
    status.setItemState(statusEntity.getItemState());
    status.setDetail(statusEntity.getDetail());
    status.setNumba(statusEntity.getNumba());
    status.setDaet(statusEntity.getDaet());
    status.setMsgType(statusEntity.getMsgType());
    status.setExecId(statusEntity.getExecId());

    return status;
  }

  public List<StatusEntity> statuseToStatusEntities(List<Status> zeitungs) {
    return zeitungs.stream().map(this::statusToSTatusEntity).collect(Collectors.toList());
  }

  public List<Status> statusEntitiesToStatuse(List<StatusEntity> zes) {
    return zes.stream().map(this::statusEntityToSTatus).collect(Collectors.toList());
  }
}
