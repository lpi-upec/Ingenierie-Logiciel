package me.edenskull;

import me.edenskull.jaxb.Article;
import me.edenskull.jaxb.Bibliographie;
import me.edenskull.jaxb.Livre;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.FileReader;

public class Main {

	public static void reader(String[] args) throws Exception {
		String inputName = "~/Documents/_cours/Ingenierie-Logiciel/ex2/src/bibliographie.xml";

		FileReader reader = new FileReader(inputName);
		JAXBContext context = JAXBContext.newInstance("jaxb.GenerationXml");
		Unmarshaller decodeur = context.createUnmarshaller();

		 Bibliographie bibliographie = (Bibliographie) decodeur.unmarshal(reader);

		for (Object obj : bibliographie.getArticle()) {
			Article a = (Article) obj;
			System.out.println(a.getTitre());
			System.out.println(a.getAuteur());
			System.out.println(a.getRef().getJournal());
		}
		for (Object obj : bibliographie.getLivre()) {
			Livre l = (Livre) obj;
			System.out.println(l.getTitre());
			System.out.println(l.getAuteur());
			System.out.println(l.getEdition().getName());
		}
	}

}
