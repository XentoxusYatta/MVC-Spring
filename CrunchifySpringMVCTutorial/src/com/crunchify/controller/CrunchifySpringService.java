package com.crunchify.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CrunchifySpringService {

	public String ParserMethode() {

		StringBuilder sb = new StringBuilder();

		String message = "Fertig?: ";

		try {
			File file = new File("C:\\Users\\kolja.kuehner\\git\\MVC-Spring\\CrunchifySpringMVCTutorial\\einlesen.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

//			String zeile = "";
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
			sb.append(message);

//			while ((zeile = br.readLine()) != null) {
//				zeile = zeile + " ";
//				sb.append(zeile);

				java.io.BufferedReader fileReader = new java.io.BufferedReader(new java.io.FileReader(new java.io.File(
						"C:\\Users\\kolja.kuehner\\git\\MVC-Spring\\CrunchifySpringMVCTutorial\\usage-data.csv")));

				String zeile1 = "";
				CharSequence cs1 = "@";

				HashMap<String, Date> map = new HashMap<>();

				zeile1 = fileReader.readLine();
				while (null != (zeile1 = fileReader.readLine())) {
					String[] split = zeile1.split(";");

					Date date = sdf.parse(split[0]);

					boolean Sysbed = split[1].contains(cs1);

					if (Sysbed) {

						if (map.containsKey(split[1])) {

							if (map.get(split[1]).before(date)) {

								map.put(split[1], date);

							}

						} else {

							map.put(split[1], date);

						}

					}
				}

				Map<String, Date> sMap = map.entrySet().stream().sorted(Entry.comparingByValue())
						.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

				for (Map.Entry<String, Date> entry : sMap.entrySet()) {

					System.out.println(entry);

					sb.append(entry);

				}

				fileReader.close();
				br.close();
			
		} catch (Exception e) {
			e.printStackTrace();

		}
		return sb.toString();
	}
}
