package com.hollongtree.ehospital;

import com.hollongtree.ehospital.entity.*;
import com.hollongtree.ehospital.entity.*;
import com.hollongtree.ehospital.property.FileStorageProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


import java.util.HashSet;
import java.util.Set;



//@SpringBootApplication
public class EhospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EhospitalApplication.class, args);

	}
		/*@Override
		public void run(String... args) throws Exception {


				Set<Login> loginset = new HashSet<Login>();

				Set<Location>locationset = new HashSet<Location>();

				Set<Page>pageSet = new HashSet<Page>();


				Patient patient = new Patient();
				patient.setPatientname("Rahul");
				patient.setAddress_1("bangalore");
				patient.setAddress_2("AA");
				patient.setAddress_3("AB");
				patient.setAddress_4("Ac");
				patient.setAddress_5("Af");
				patient.setAge(12);
				patient.setDateofbirth("12/6");
				patient.setGender("M");
				patient.setGovt_health_id("pancard");
				patient.setHeight(6);
				patient.setHeighttype("average");
				patient.setWeight(55);
				patient.setWeighttype("Normal");
				patient.setUdf1("hv");
				patient.setUdf2("hv");
				patient.setUdf3("hv");
				patient.setUdf4("hv");
				patient.setUdf5("hv");
				patient.setPatientmobile("fss44444");



				Prescription p1= new Prescription();
				Prescription p2= new Prescription();

				p1.setPatient(patient);
				p2.setPatient(patient);

				Page page1= new Page();
				page1.setPageid(12);
				page1.setPagepath("Download");

				Page page2= new Page();
				page2.setPageid(13);
				page2.setPagepath("Desktop");

				pageSet.add(page1);
				pageSet.add(page2);






				p1.setPages(pageSet);
				p2.setPages(pageSet);

				patient.getPrescriptions().add(p1);
				patient.getPrescriptions().add(p2);


				Location l1= new Location();
				Location l2= new Location();

				l1.setAltitude("23");
				l1.setLocation("BAngalore");
				l1.setLocationid(3);
				l1.setLongitude("QA2");
				// l1.setPatient(patient);

				l2.setAltitude("24");
				l2.setLocation("Delhi");
				l2.setLocationid(3);
				l2.setLongitude("HVFs2");
				// l2.setPatient(patient);

				locationset.add(l1);
				locationset.add(l2);



				patient.setLocation(locationset);



//			 patient.getLocation().add(l1);
//			 patient.getLocation().add(l2);



				Login Ln1= new Login();
				Login Ln2= new Login();

				Ln1.setLoginhistoryid(1);
				Ln1.setLogintime("DAY");
				Ln1.setLogouttime("Afternoon");
				// Ln1.setPatient(patient);

				Ln2.setLoginhistoryid(2);
				Ln2.setLogintime("Evening");
				Ln2.setLogouttime("Night");
				// Ln2.setPatient(patient);

				loginset.add(Ln1);
				loginset.add(Ln2);




				patient.setLogin(loginset);









		}
*/
	}



