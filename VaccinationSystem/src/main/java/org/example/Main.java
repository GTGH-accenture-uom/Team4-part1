package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Insured in1 = new Insured("623142589", "32012014719", "Maria", LocalDate.of(1997, 8, 6), "Filippou", "mf@gmail.com");
        Insured in2 = new Insured("632598745", "12021485763", "Nikos", LocalDate.of(1947, 1, 19), "Pappas", "np@gmail.com");
        Insured in3 = new Insured("410326987", "30269821475", "Giorgos", LocalDate.of(1985, 3, 24), "Dimitriou", "gd@gmail.com");
        Insured in4 = new Insured("425849207", "63201245785", "Nikoleta", LocalDate.of(2008, 4, 12), "Konstantinou", "nk@gmail.com");
        Insured in5 = new Insured("103202698", "31642758924", "Georgia", LocalDate.of(1964, 11, 30), "Nikou", "gn@gmail.com");
        Insured in6 = new Insured("752165369", "16425378194", "Kostas", LocalDate.of(1972, 6, 4), "Anagnostou", "ka@gmail.com");
        Insured in7 = new Insured("930215478", "23062458175", "Dimitris", LocalDate.of(2004, 12, 17), "Bellos", "db@gmail.com");
        Insured in8 = new Insured("032145698", "46532987013", "Giannis", LocalDate.of(2001, 2, 22), "Filippou", "gf@gmail.com");
        Insured in9 = new Insured("142158769", "75403125487", "Giorgos", LocalDate.of(1941, 5, 10), "Ioannou", "gi@gmail.com");
        Insured in10 = new Insured("632023215", "24006124586", "Nikos", LocalDate.of(1955, 7, 9), "Georgiou", "ng@gmail.com");
        Insured in11 = new Insured("103269825", "32026589741", "Vasilis", LocalDate.of(1967, 9, 13), "Nikou", "vn@gmail.com");
        Insured in12 = new Insured("302654782", "84256985256", "Ioanna", LocalDate.of(1996, 10, 27), "Athanasiou", "ia@gmail.com");
        Insured in13 = new Insured("102365877", "10121457418", "Pavlos", LocalDate.of(1993, 8, 15), "Spirou", "ps@gmail.com");
        Insured in14 = new Insured("232022698", "30259862100", "Anastasia", LocalDate.of(1994, 9, 10), "Dimitriou", "ad@gmail.com");
        Insured in15 = new Insured("420365897", "23015002978", "Eydokia", LocalDate.of(1977, 3, 1), "Sotiriou", "es@gmail.com");


        List<Insured> insuredList = new ArrayList<>();
        insuredList.addAll(List.of(in1, in2, in3, in4, in5, in6, in7, in8, in9, in10, in11, in12, in13, in14, in15));

        //System.out.println(insuredList);

        Timeslot t1 = new Timeslot(20, 5, 2022, 8, 00, 00, 30, new Doctor());
        Timeslot t2 = new Timeslot(20, 5, 2022, 8, 30, 30, 59, new Doctor());
        Timeslot t3 = new Timeslot(22, 5, 2022, 9, 00, 00, 30, new Doctor());
        Timeslot t4 = new Timeslot(22, 5, 2022, 9, 30, 30, 59, new Doctor());
        Timeslot t5 = new Timeslot(25, 5, 2022, 10, 00, 00, 30, new Doctor());
        Timeslot t6 = new Timeslot(25, 5, 2022, 10, 30, 30, 59, new Doctor());
        Timeslot t7 = new Timeslot(27, 5, 2022, 11, 00, 00, 30, new Doctor());
        Timeslot t8 = new Timeslot(27, 5, 2022, 11, 30, 30, 59, new Doctor());
        Timeslot t9 = new Timeslot(29, 5, 2022, 12, 00, 00, 30, new Doctor());
        Timeslot t10 = new Timeslot(29, 5, 2022, 12, 30, 30, 59, new Doctor());
        Timeslot t11 = new Timeslot(24, 6, 2022, 13, 00, 00, 30, new Doctor());
        Timeslot t12 = new Timeslot(24, 6, 2022, 13, 30, 30, 59, new Doctor());
        Timeslot t13 = new Timeslot(1, 6, 2022, 14, 00, 00, 30, new Doctor());
        Timeslot t14 = new Timeslot(1, 6, 2022, 14, 30, 30, 59, new Doctor());
        Timeslot t15 = new Timeslot(4, 6, 2022, 15, 00, 00, 30, new Doctor());
        Timeslot t16 = new Timeslot(4, 6, 2022, 15, 30, 30, 59, new Doctor());
        Timeslot t17 = new Timeslot(15, 6, 2022, 16, 00, 00, 30, new Doctor());
        Timeslot t18 = new Timeslot(15, 6, 2022, 16, 30, 30, 59, new Doctor());
        Timeslot t19 = new Timeslot(16, 6, 2022, 17, 00, 00, 30, new Doctor());
        Timeslot t20 = new Timeslot(16, 6, 2022, 17, 30, 30, 59, new Doctor());

        List<Timeslot> timeslotList1 = new ArrayList<>();
        timeslotList1.addAll(List.of(t1, t3, t5, t7, t9, t11, t13, t15, t17, t19));
        List<Timeslot> timeslotList2 = new ArrayList<>();
        timeslotList2.addAll(List.of(t2, t4, t6, t8, t10, t12, t14, t16, t18, t20));

        Doctor d1 = new Doctor("03237800341", "Nikos", "Xatzivasileiou", new ArrayList<>());
        Doctor d2 = new Doctor("17058900232", "Katerina", "Papadopoulou", new ArrayList<>());
        Doctor d3 = new Doctor("13117500433", "Giorgos", "Dionisiou", new ArrayList<>());
        Doctor d4 = new Doctor("28028900456", "Maria", "Anastasiou", new ArrayList<>());

        VaccinationCenter vc1 = new VaccinationCenter("1", "Ethnikis Aminis 1", timeslotList1);
        VaccinationCenter vc2 = new VaccinationCenter("2", "Egnatias 45", timeslotList2);

        for (int i = 0; i < timeslotList1.size(); i++) {
            if (i % 2 == 0) {
                timeslotList1.get(i).setDoctor(d1);
                d1.addTimeslot(timeslotList1.get(i));
            } else {
                timeslotList1.get(i).setDoctor(d2);
                d2.addTimeslot(timeslotList1.get(i));
            }
        }
        for (int i = 0; i < timeslotList2.size(); i++) {
            if (i % 2 == 0) {
                timeslotList2.get(i).setDoctor(d3);
                d3.addTimeslot(timeslotList2.get(i));

            } else {
                timeslotList2.get(i).setDoctor(d4);
                d4.addTimeslot(timeslotList2.get(i));
            }
        }

        Reservation r1 = new Reservation(in2, timeslotList1.get(0));
        timeslotList1.get(0).setAvailable(false);
        in2.setTimeslot(r1);
        Reservation r2 = new Reservation(in7, timeslotList2.get(2));
        timeslotList2.get(2).setAvailable(false);
        in7.setTimeslot(r2);
        Reservation r3 = new Reservation(in4, timeslotList1.get(3));
        timeslotList1.get(3).setAvailable(false);
        in4.setTimeslot(r3);
        Reservation r4 = new Reservation(in9, timeslotList2.get(7));
        timeslotList2.get(7).setAvailable(false);
        in9.setTimeslot(r4);
        Reservation r5 = new Reservation(in12, timeslotList1.get(5));
        timeslotList1.get(5).setAvailable(false);
        in12.setTimeslot(r5);
        Reservation r6 = new Reservation(in15, timeslotList2.get(4));
        timeslotList2.get(4).setAvailable(false);
        in15.setTimeslot(r6);
        Reservation r7 = new Reservation(in3, timeslotList1.get(1));
        timeslotList1.get(1).setAvailable(false);
        in3.setTimeslot(r7);
        Reservation r8 = new Reservation(in8, timeslotList2.get(9));
        timeslotList2.get(9).setAvailable(false);
        in8.setTimeslot(r8);

        Vaccination v1 = new Vaccination(in2, in2.getTimeslot().getDoctor(), in2.getTimeslot().getDate(), Vaccination.VaccDuration(in2.getTimeslot().getDate()));
        Vaccination v2 = new Vaccination(in12, in12.getTimeslot().getDoctor(), in12.getTimeslot().getDate(), Vaccination.VaccDuration(in12.getTimeslot().getDate()));
        Vaccination v3 = new Vaccination(in3, in3.getTimeslot().getDoctor(), in3.getTimeslot().getDate(), Vaccination.VaccDuration(in3.getTimeslot().getDate()));
        Vaccination v4 = new Vaccination(in15, in15.getTimeslot().getDoctor(), in15.getTimeslot().getDate(), Vaccination.VaccDuration(in15.getTimeslot().getDate()));
        Vaccination v5 = new Vaccination(in8, in8.getTimeslot().getDoctor(), in8.getTimeslot().getDate(), Vaccination.VaccDuration(in8.getTimeslot().getDate()));
        Vaccination v6 = new Vaccination(in7, in7.getTimeslot().getDoctor(), in7.getTimeslot().getDate(), Vaccination.VaccDuration(in7.getTimeslot().getDate()));

        List<Vaccination> vaccinationList = new ArrayList<>();
        vaccinationList.addAll(List.of(v1,v2,v3,v4,v5,v6));

        System.out.println(vc1.CheckReservations());
        System.out.println(vc2.CheckReservations());

        System.out.println(vc1.CheckAvailableAppointments());
        System.out.println(vc2.CheckAvailableAppointments());

        System.out.println(d1.VaccinationPerDoctor(vaccinationList));
        System.out.println(d2.VaccinationPerDoctor(vaccinationList));
        System.out.println(d3.VaccinationPerDoctor(vaccinationList));
        System.out.println(d4.VaccinationPerDoctor(vaccinationList));

        System.out.println(Insured.checkforVaccinated(insuredList,60));

        String results = vc1.CheckReservations() + "\n" + vc2.CheckReservations() + "\n" + vc1.CheckAvailableAppointments() + "\n" + vc2.CheckAvailableAppointments()
                + "\n" + d1.VaccinationPerDoctor(vaccinationList) + "\n" + d2.VaccinationPerDoctor(vaccinationList) + "\n" +
                d3.VaccinationPerDoctor(vaccinationList) + "\n" + d4.VaccinationPerDoctor(vaccinationList) + "\n" + Insured.checkforVaccinated(insuredList,60);

        FileWriter fileWriter = new FileWriter();
        fileWriter.createFile();
        fileWriter.writeFile(results);



    }




}

