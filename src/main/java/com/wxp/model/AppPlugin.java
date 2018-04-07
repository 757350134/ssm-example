package com.wxp.model;

import java.util.List;

public class AppPlugin {
    private Integer id;

    private String name;

    private Integer version;

    private Integer money;

    private String icon;

    private int autoInstall;

    private int isDebug;

    private String desc;
    
    private List targetAppList;



	public List getTargetAppList() {
		return targetAppList;
	}

	public void setTargetAppList(List targetAppList) {
		this.targetAppList = targetAppList;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }





    public int getAutoInstall() {
		return autoInstall;
	}

	public void setAutoInstall(int autoInstall) {
		this.autoInstall = autoInstall;
	}

	public int getIsDebug() {
		return isDebug;
	}

	public void setIsDebug(int isDebug) {
		this.isDebug = isDebug;
	}

	public void setIsDebug(Byte isDebug) {
        this.isDebug = isDebug;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}