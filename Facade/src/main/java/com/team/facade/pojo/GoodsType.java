package com.team.facade.pojo;

/**
 * @Auther: PWJ
 * @Date: 2018/11/20 23:02
 * @Description:
 * @Version: 1.0
 */
public class GoodsType {
    private int typeId;
    private String typeName;
    private String typeDes;
    private int typeParentId;
    private String typePicture;

    public GoodsType() {
    }

    public GoodsType(int typeId, String typeName, String typeDes, int typeParentId, String typePicture) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.typeDes = typeDes;
        this.typeParentId = typeParentId;
        this.typePicture = typePicture;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
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

    public int getTypeParentId() {
        return typeParentId;
    }

    public void setTypeParentId(int typeParentId) {
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
