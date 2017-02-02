package dnp.Fifth.Homework;

public class Mergermaster {
	public static void main(String[] args) {
		Mergetwofiles m = new Mergetwofiles ("D:\\My Documents\\2\\autounix.txt\\",
				"D:\\My Documents\\2\\path to.txt\\");
		m.writeMergeTwoFilesToOtherFile("D:\\My Documents\\2\\file3.txt");
	}
}
