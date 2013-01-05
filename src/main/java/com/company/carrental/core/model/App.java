package com.company.carrental.core.model;

import org.hibernate.Session;

import com.company.carrental.core.util.HibernateUtil;

/**
 * Hello world!
 * 
 */
public class App {
    public static void main(String[] args) {
//        DriverMaster dm = new DriverMaster();
//        AreaMaster am1 = new AreaMaster();
//        am1.setAreaName("borivali west");
//        am1.setPinCode(400092);
//        
//        AreaMaster am2 = new AreaMaster();
//        am2.setAreaName("borivali east");
//        am2.setPinCode(400091);
//        
//        AreaMaster am3 = new AreaMaster();
//        am3.setAreaName("borivali east high way");
//        am3.setPinCode(400090);
//        
//        Set<AreaMaster> nA = new HashSet<AreaMaster>();
//        nA.add(am2);
//        nA.add(am3);
//        
//        am1.setNearestAreas(nA);
        
//        AreaMaster am = new AreaMaster();
//        am.setAreaId(1);
        
        Session session = HibernateUtil.getAnnotatedSessionFactory().openSession();
        session.beginTransaction();
//        session.persist(am1);
//        session.persist(am2);
//        session.persist(am3);
        System.out.println("Hello World!");
        
        
        session.getTransaction().commit();
        session.close();
    }
}
