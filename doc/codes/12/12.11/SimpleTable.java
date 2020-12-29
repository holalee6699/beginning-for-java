
import javax.swing.*;
/**
 * Description:
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 5.0
 */
public class SimpleTable
{
	JFrame jf = new JFrame("�򵥱���");
	JTable table;
	// �����ά������Ϊ��������
	Object[][] tableData =
	{
		new Object[] {"������", 29, "Ů"},
		new Object[] {"�ո�����", 56, "��"},
		new Object[] {"���", 35, "��"},
		new Object[] {"Ū��", 18, "Ů"},
		new Object[] {"��ͷ", 2, "��"}
	};
	// ����һά������Ϊ�б���
	Object[] columnTitle = {"����", "����", "�Ա�"};
	public void init()
	{
		// �Զ�ά�����һά����������һ��JTable����
		table = new JTable(tableData, columnTitle);
		// ��JTable�������JScrollPane�У�
		// ������JScrollPane���ڴ�������ʾ����
		jf.add(new JScrollPane(table));
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new SimpleTable().init();
	}
}
