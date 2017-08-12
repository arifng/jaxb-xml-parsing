package com.learning;

import com.learning.model.Company;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * Created by arif on 8/11/2017.
 */
public class Main {
    public static void main(String[] agrs) {
        try {
            /*
            Extract data from xml file in resources directory
             */
            Company company = unmarshalling();

            /*
            Passing the exact model of xml by unmarshalling xml file. Alternatively, can construct company object
            with all data. It will create xml same as xml in resources directory.
             */
            marshalling(company);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void marshalling(Company company) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Company.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(company, System.out);
    }

    private static Company unmarshalling() throws JAXBException, IOException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Company.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        File file = new File("src/main/resources/complex.xml");
        Company company = (Company) unmarshaller.unmarshal(file);

        if(company != null) {
            System.out.println("Unmarshalling successful!");
        }

        return company;
    }
}
