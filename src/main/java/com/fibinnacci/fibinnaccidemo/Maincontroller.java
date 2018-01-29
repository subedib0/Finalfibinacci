package com.fibinnacci.fibinnaccidemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController

public class Maincontroller {
    @RequestMapping("/febseq")
    public String febseq(@RequestParam("num") int num) {
        String febseq = "";
int[] feb = new int[num];
        int i;

      feb[0] = 0;
      feb[1] = 1;
       feb[2] = 2;
        feb[3] = feb[2]+feb[1];

        for ( i = 4; i < num; i++) {
            feb[i] = feb[i - 1] + feb[i - 2]+feb[i-3]+feb[i-4];
            febseq =febseq+Integer.toString(feb[i]) + "  ";

        }








febseq = febseq + Integer.toString(num);



        return Integer.toString(feb[0])+" "+Integer.toString(feb[1])+"  "+Integer.toString(feb[2])+"  "+Integer.toString(feb[3])+ " "+febseq + "  ";






    }


}

