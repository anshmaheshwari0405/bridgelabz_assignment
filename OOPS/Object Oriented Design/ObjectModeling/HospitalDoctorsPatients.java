import java.util.*;
public class HospitalDoctorsPatients {
    static class Patient {
        String name;
        public Patient(String name){ this.name=name; }
        public String toString(){ return name; }
    }
    static class Doctor {
        String name;
        List<Patient> patients = new ArrayList<>();
        public Doctor(String name){ this.name=name; }
        public void consult(Patient p){ patients.add(p); System.out.println(name+" consults "+p.name); }
    }
    static class Hospital {
        String name;
        List<Doctor> doctors = new ArrayList<>();
        public Hospital(String name){ this.name=name; }
        public void addDoctor(Doctor d){ doctors.add(d); }
    }
    public static void main(String[] args){
        Hospital h=new Hospital("CityHosp");
        Doctor d1=new Doctor("Doc1");
        Patient p1=new Patient("Pat1");
        h.addDoctor(d1);
        d1.consult(p1);
    }
}
