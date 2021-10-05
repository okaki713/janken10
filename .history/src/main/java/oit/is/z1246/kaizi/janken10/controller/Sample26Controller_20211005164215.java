package oit.is.z1246.kaizi.janken10.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// import oit.is.z1246.kaizi.janken10.model.Score;

/**
 * @RequestMapping("/sample26")をクラスの前につけると，このクラスのすべてのメソッドは/sample26で呼び出されることを表す
 */
@Controller
@RequestMapping("/sample26")
public class Sample26Controller {

  /**
   * @GetMappingに引数が与えられていないので，クラスで指定されたとおり/sample26へのGETリクエストがあったら，sample26()を呼び出して，sample26.htmlを返す
   *
   * @return
   */
  @GetMapping
  public String sample26() {
    return "sample26.html";
  }
}
