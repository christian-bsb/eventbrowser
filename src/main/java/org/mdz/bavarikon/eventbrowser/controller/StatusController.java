package org.mdz.bavarikon.eventbrowser.controller;

import java.util.List;
import org.mdz.bavarikon.eventbrowser.service.StatusService;
import org.mdz.bavarikon.workflow.model.extern.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StatusController {

  private static final Logger LOGGER = LoggerFactory.getLogger(StatusController.class);

  @Autowired StatusService statusService;

  @RequestMapping(path = "/status/batch/{batchId}/{msgType}", produces = "application/json")
  public List<Status> getByBatch(
      @PathVariable(value = "batchId") Long batchId,
      @PathVariable(value = "msgType") String msgType)
      throws Exception {
    return statusService.getStatusByBatchId(batchId, msgType);
  }

  @RequestMapping(path = "/status/bavid/{bavId}", produces = "application/json")
  public List<Status> getByBavId(@PathVariable(value = "bavId") String bavId) throws Exception {
    return statusService.getStatusByBavId(bavId);
  }

  @PostMapping(
      path = "/status/insert",
      consumes = "application/json",
      produces = "application/json")
  public void insertStatus(@RequestBody Status status) {
    LOGGER.info("insert status {}", status.toString());
    statusService.save(status);
  }
}
