package com.enmuDemo;

public enum Day2 {
	 MONDAY("����һ"),
	 TUESDAY("���ڶ�"),
	 WEDNESDAY("������"),
	 THURSDAY("������"),
	 FRIDAY("������"),
	 SATURDAY("������"),
	 SUNDAY("������");//��סҪ�÷ֺŽ���
	
	 private String desc;//��������
	
	 /**
     * ˽�й���,��ֹ���ⲿ����
     * @param desc
     */
    private Day2(String desc){
        this.desc=desc;
    }
    
    /**
     * ���巽��,��������,��������Ķ���û����
     * @return
     */
    public String getDesc(){
        return desc;
    }
    
    public static void main(String[] args){
        for (Day2 day:Day2.values()) {
            System.out.println("name:"+day.name()+
                    ",desc:"+day.getDesc());
        }
    }
    
}
