package org.mdz.bavarikon.eventbrowser.repository;

import java.util.List;
import org.mdz.bavarikon.eventbrowser.model.hibernate.StatusEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends CrudRepository<StatusEntity, Long> {
  List<StatusEntity> findByExecIdAndMsgType(Long batchId, String msgType);

  List<StatusEntity> findByItemId(String bavId);
}
