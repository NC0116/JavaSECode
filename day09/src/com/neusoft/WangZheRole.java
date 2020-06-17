package com.neusoft;

public class WangZheRole {
    //接口作为成员变量
    private  FaShuSkill faShuSkill;

    public FaShuSkill getFaShuSkill() {
        return faShuSkill;
    }

    public void setFaShuSkill(FaShuSkill faShuSkill) {
        this.faShuSkill = faShuSkill;
    }

    //发动法术攻击
    public void faShSkillAttack(){
        System.out.println("开始发动法术攻击");
        faShuSkill.faShAttack();
        System.out.println("技能释放完毕");
    }
}
