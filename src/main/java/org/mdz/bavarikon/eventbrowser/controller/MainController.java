package org.mdz.bavarikon.eventbrowser.controller;

import org.mdz.bavarikon.eventbrowser.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @Autowired StatusService statusService;

  @RequestMapping("/")
  public String index() {
    statusService.testInsert();
    return "Greetings from Spring Boot!";
  }

  @RequestMapping("/issue/insert/{name}")
  public void insertIssue(@PathVariable("name") String name) {
    // issueService.save(new IssueEntity(name));
  }
}
