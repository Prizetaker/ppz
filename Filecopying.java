package dnp.Fifth.Homework;

import java.io.*;

public class Filecopying {

	private String inputPath;
	private String outputPath;
	private File file;
	private String[] fileNamesArray;

	public Filecopying() {
	}

	public Filecopying(String inputPath, String outputPath) {
		this.inputPath = inputPath;
		this.outputPath = outputPath;
		this.file = new File(inputPath);
		this.fileNamesArray = file.list();
	}

	public Filecopying(String inputPath, String outputPath, String[] pathname) {
		this.inputPath = inputPath;
		this.outputPath = outputPath;
		FileFilter(pathname);
	}

	private void FileFilter(String[] pathname) {
		this.file = new File(inputPath);
		FileFilter choose = new Pickfileout(pathname);
		File[] fileList = file.listFiles(choose);
		this.fileNamesArray = new String[fileList.length];
		for (int i = 0; i < fileNamesArray.length; i++) {
			fileNamesArray[i] = fileList[i].getName();
		}
	}

	public boolean copyTextToNewFiles() {
		for (String filename : fileNamesArray) {
			try (InputStream is = new FileInputStream(new File(inputPath + filename));
				 OutputStream os = new FileOutputStream(new File(outputPath + filename))) {
				byte[] buffer = new byte[1024];
				int length;
				while ((length = is.read(buffer)) > 0) {
					os.write(buffer, 0, length);
				}
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}

	public String getInputPath() {
		return inputPath;
	}

	public String getOutputPath() {
		return outputPath;
	}

	public String[] getFileNamesArray() {
		return fileNamesArray;
	}

	public File getFile() {
		return file;
	}

	public void setInputPath(String inputPath) {
		this.inputPath = inputPath;
	}

	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public void setFileNamesArray(String[] fileNamesArray) {
		this.fileNamesArray = fileNamesArray;
	}

}
