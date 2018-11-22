package com.team.facade.pojo;

import java.io.Serializable;

/**
 * @Auther: PWJ
 * @Date: 2018/11/20 23:02
 * @Description:
 * @Version: 1.0
 */
public class GoodsType implements Serializable {
    private static final long serialVersionUID = 4418855586782990389L;
    private Integer typeId;
    private String typeName;
    private String typeDes;
    private Integer typeParentId;
    private String typePicture;

    public GoodsType() {
    }

    public GoodsType(Integer typeId, String typeName, String typeDes, Integer typeParentId, String typePicture) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.typeDes = typeDes;
        this.typeParentId = typeParentId;
        this.typePicture = typePicture;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeDes() {
        return typeDes;
    }

    public void setTypeDes(String typeDes) {
        this.typeDes = typeDes;
    }

    public Integer getTypeParentId() {
        return typeParentId;
    }

    public void setTypeParentId(Integer typeParentId) {
        this.typeParentId = typeParentId;
    }

    public String getTypePicture() {
        return typePicture;
    }

    public void setTypePicture(String typePicture) {
        this.typePicture = typePicture;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", typeDes='" + typeDes + '\'' +
                ", typeParentId=" + typeParentId +
                ", typePicture='" + typePicture + '\'' +
                '}';
    }
}
