/*
 * Copyright (C) 2020 Karsten Reincke, Deutsche Telekom AG
 *
 * tdosca-tc03a.main is licensed under the terms of the MIT license.
 * For details see the file COPYING in the top directory.
 */

package tdosca.tc03a;

public class Main {
  public static void main(String[] args) {
    GreetingService service = new GreetingService();
    System.out.println("tdosca.tc03a.Main: 'hello'.");
    System.out.println("license(Main,M.I.T)");
    if ((args == null) || (args.length == 0)){
      service.greet();
    }
    else {
      service.greet(args[0]);
    }
    System.out.println("tdosca.tc03a.Main: 'bye bye'");
  }
}
