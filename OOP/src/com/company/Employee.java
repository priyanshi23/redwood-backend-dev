package com.company;

import java.util.Date;

public class Employee {
    public void setEmployee(String[][][] employee) {
        String[][][] emp =  {{{"Name","Year of Joining","Address"},{"Robert","1994","64C-Walls Street"},{"Sam","2000","68D-Walls Street"},{"John","1999","26B-Walls Street"}}};

        for (int i = 0; i < emp.length ; i++) {
            for (int j = 0; j < emp.length ; j++) {
                for (int k = 0; k < emp.length; k++) {
                    System.out.print(emp[i][j][k] + "\t");
                }
                        System.out.println("");
            }
            System.out.println("");
        }
    }



    }









