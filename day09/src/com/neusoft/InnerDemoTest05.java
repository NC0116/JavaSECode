package com.neusoft;

public class InnerDemoTest05 {
    public static void main(String[] args) {
        WangZheRole role = new WangZheRole();


        //设置角色的法术技能
        role.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShAttack() {
                System.out.println("发射爱心");
            }
        });

        //发动法术攻击
        role.faShSkillAttack();

        //更换技能
        role.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShAttack() {
                System.out.println("发射烤羊荣串");
            }
        });
        //发动法术攻击
        role.faShSkillAttack();

    }
}
