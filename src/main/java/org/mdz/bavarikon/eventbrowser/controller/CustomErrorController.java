package org.mdz.bavarikon.eventbrowser.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomErrorController implements ErrorController {

  /*
  @RequestMapping("/error")
  @ResponseBody
  String error(HttpServletRequest request) {
      Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
    return "<h1>Error occurred</h1>";
  }
  */

}
