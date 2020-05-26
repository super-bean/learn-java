package com.learn.prototype;

/**
 *
 *（1）优点：
 *   ①如果创建新的对象比较复杂时，可以利用原型模式简化对象的创建过程，同时也能够提高效率。
 *   ②可以使用深克隆保持对象的状态。
 *   ③原型模式提供了简化的创建结构。
 *（2）缺点：
 *   ①需要为每一个类配备一个克隆方法，而且这个克隆方法需要对类的功能进行通盘考虑，这对全新的类来说不是很难，
 *     但对已有的类进行改造时，不一定是件容易的事，必须修改其源代码，违背了“开闭原则”。
 *（3）应用场景：
 *   ①如果创建新对象成本较大，我们可以利用已有的对象进行复制来获得。
 *   ②如果系统要保存对象的状态，而对象的状态变化很小，或者对象本身占内存不大的时候，也可以使用原型模式配合备忘录模式来应用。
 *    相反，如果对象的状态变化很大，或者对象占用的内存很大，那么采用状态模式会比原型模式更好。
 */
public class Resume implements Cloneable {
    private String name;
    private String birthday;
    private String sex;
    private String school;
    private String timeArea;
    private String company;

    /**
     * 构造函数：初始化简历赋值姓名
     */
    public Resume(String name){
        this.name = name;
    }

    /**
     * @desc 设定个人基本信息
     * @param birthday 生日
     * @param sex 性别
     * @param school 毕业学校
     * @return void
     */
    public void setPersonInfo(String birthday,String sex,String school){
        this.birthday = birthday;
        this.sex = sex;
        this.school = school;
    }

    /**
     * @desc 设定工作经历
     * @param timeArea 工作年限
     * @param company 所在公司
     * @return void
     */
    public void setWorkExperience(String timeArea,String company){
        this.timeArea = timeArea;
        this.company = company;
    }

    /**
     * 克隆该实例
     */
    public Object clone(){
        Resume resume = null;
        try {
            resume = (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resume;
    }

    public void display(){
        System.out.println("姓名：" + name);
        System.out.println("生日:" + birthday + ",性别:" + sex + ",毕业学校：" + school);
        System.out.println("工作年限:" + timeArea + ",公司:" + company);
    }

}