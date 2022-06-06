package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Insured in1 = new Insured("623142589","32012014719","Maria",new Date(1997,8,6) ,"Filippou", "mf@gmail.com" );
        Insured in2 = new Insured("632598745","12021485763","Nikos",new Date(1947,1,19) ,"Pappas", "np@gmail.com" );
        Insured in3 = new Insured("410326987","30269821475","Giorgos",new Date(1985,3,24) ,"Dimitriou", "gd@gmail.com" );
        Insured in4 = new Insured("425849207","63201245785","Nikoleta",new Date(2008,4,12) ,"Konstantinou", "nk@gmail.com" );
        Insured in5 = new Insured("103202698","31642758924","Georgia",new Date(1964,11,30) ,"Nikou", "gn@gmail.com" );
        Insured in6 = new Insured("752165369","16425378194","Kostas",new Date(1972,6,4) ,"Anagnostou", "ka@gmail.com" );
        Insured in7 = new Insured("930215478","23062458175","Dimitris",new Date(2004,12,17) ,"Bellos", "db@gmail.com" );
        Insured in8 = new Insured("032145698","46532987013","Giannis",new Date(2001,2,22) ,"Filippou", "gf@gmail.com" );
        Insured in9 = new Insured("142158769","75403125487","Giorgos",new Date(1941,5,10) ,"Ioannou", "gi@gmail.com" );
        Insured in10 = new Insured("632023215","24006124586","Nikos",new Date(1955,7,9) ,"Georgiou", "ng@gmail.com" );
        Insured in11 = new Insured("103269825","32026589741","Vasilis",new Date(1967,9,13) ,"Nikou", "vn@gmail.com" );
        Insured in12 = new Insured("302654782","84256985256","Ioanna",new Date(1996,10,27) ,"Athanasiou", "ia@gmail.com" );
        Insured in13 = new Insured("102365877","10121457418","Pavlos",new Date(1993,8,15) ,"Spirou", "ps@gmail.com" );
        Insured in14 = new Insured("232022698","30259862100","Anastasia",new Date(1994,9,10) ,"Dimitriou", "ad@gmail.com" );
        Insured in15 = new Insured("420365897","23015002978","Eydokia",new Date(1977,3,1) ,"Sotiriou", "es@gmail.com" );

        List<Insured> insuredList = new ArrayList<>();

        insuredList.add(in1);
        insuredList.add(in2);
        insuredList.add(in3);
        insuredList.add(in4);
        insuredList.add(in5);
        insuredList.add(in6);
        insuredList.add(in7);
        insuredList.add(in8);
        insuredList.add(in9);
        insuredList.add(in10);
        insuredList.add(in11);
        insuredList.add(in12);
        insuredList.add(in13);
        insuredList.add(in14);
        insuredList.add(in15);

        System.out.println(insuredList);

    }

}