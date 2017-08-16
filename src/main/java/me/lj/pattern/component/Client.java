package me.lj.pattern.component;

public class Client {
	public static void main(String[] args) {
		//����һ��Ŀ¼�����ʾC�̸�Ŀ¼
		Dir diskC = new Folder("C");
		
		//C�̸�Ŀ¼����һ���ļ�Log.txt
		diskC.addDir(new File("Log.txt"));
		
		//C�̸�Ŀ¼��������Ŀ¼Windows��PerfLogs��Program File
		Dir dirWin = new Folder("Windows");
		
		//WindowsĿ¼�����ļ�explorer.exe
		dirWin.addDir(new File("explorer.exe"));
		diskC.addDir(dirWin);
		
		//PerfLogsĿ¼
		Dir dirPer = new Folder("PerfLogs");
		
		//PerfLogsĿ¼�����ļ�null.txt
		dirPer.addDir(new File("null.txt"));
		diskC.addDir(dirPer);
		
		//Program FileĿ¼
		Dir dirPro = new Folder("Program File");
		
		//Program FileĿ¼�����ļ�ftp.txt
		dirPro.addDir(new File("ftp.txt"));
		diskC.addDir(dirPro);
		
		//��ӡ���ļ��ṹ
		diskC.print();
	}
}
