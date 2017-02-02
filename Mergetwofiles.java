package dnp.Fifth.Homework;

//Напишите программу которая примет на вход 2 текстовых
//файла, а вернет один. Содержимым этого файла должны
//быть слова которые есть и в первом и во втором файле.

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mergetwofiles {
	

		private String filePath1;
		private String filePath2;

		public Mergetwofiles() {
		}

		public Mergetwofiles(String filePath1, String filePath2) {
			this.filePath1 = filePath1;
			this.filePath2 = filePath2;
		}

		public boolean writeMergeTwoFilesToOtherFile(String filePath) {
			File newFile = new File(filePath);
			try (FileWriter fw = new FileWriter(newFile)){
				fw.write(mergeTwoFiles(filePath1, filePath2));
				fw.flush();
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}

		private String mergeTwoFiles(String filePath1, String filePath2) {
			List<String> file1 = getWordsFromFile(filePath1);
			List<String> file2 = getWordsFromFile(filePath2);
			file1.retainAll(file2);
			StringBuilder sb = new StringBuilder();
			for (String e : file1) {
				sb.append(e).append(" ");
			}
			System.out.println(sb.toString());
			return sb.toString();
		}

		public List<String> getWordsFromFile(String filePath) {
			StringBuilder sb = new StringBuilder();
			String str;
			try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
				while ((str = bufferedReader.readLine()) != null) {
					sb.append(str).append(" ");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			String str1 = sb.toString();
			String[] arrWordstoFile = str1.split("[ ,?.=:;]");
			List<String> arrayFile = new ArrayList<>(Arrays.asList(arrWordstoFile));
			for (String e : arrayFile) {
				System.out.print(e + " ");
			}
			System.out.println();
			return arrayFile;
		}

		public String getFilePath1() {
			return filePath1;
		}

		public void setFilePath1(String filePath1) {
			this.filePath1 = filePath1;
		}

		public String getFilePath2() {
			return filePath2;
		}

		public void setFilePath2(String filePath2) {
			this.filePath2 = filePath2;
		}
	}


