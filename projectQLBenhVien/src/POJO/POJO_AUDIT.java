/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author trung
 */
public class POJO_AUDIT {
    public String OBJECT_SCHEMA,OBJECT_NAME,POLICY_OWNER,POLICY_NAME,ENABLED,POLICY_TEXT,POLICY_COLUMN,AUDIT_TRAIL,POLICY_COLUMN_OPTIONS; 

    public String getOBJECT_SCHEMA() {
        return OBJECT_SCHEMA;
    }

    public void setOBJECT_SCHEMA(String OBJECT_SCHEMA) {
        this.OBJECT_SCHEMA = OBJECT_SCHEMA;
    }

    public String getOBJECT_NAME() {
        return OBJECT_NAME;
    }

    public void setOBJECT_NAME(String OBJECT_NAME) {
        this.OBJECT_NAME = OBJECT_NAME;
    }

    public String getPOLICY_OWNER() {
        return POLICY_OWNER;
    }

    public void setPOLICY_OWNER(String POLICY_OWNER) {
        this.POLICY_OWNER = POLICY_OWNER;
    }

    public String getPOLICY_NAME() {
        return POLICY_NAME;
    }

    public void setPOLICY_NAME(String POLICY_NAME) {
        this.POLICY_NAME = POLICY_NAME;
    }

    public String getENABLED() {
        return ENABLED;
    }

    public void setENABLED(String ENABLED) {
        this.ENABLED = ENABLED;
    }

    public String getPOLICY_TEXT() {
        return POLICY_TEXT;
    }

    public void setPOLICY_TEXT(String POLICY_TEXT) {
        this.POLICY_TEXT = POLICY_TEXT;
    }

    public String getPOLICY_COLUMN() {
        return POLICY_COLUMN;
    }

    public void setPOLICY_COLUMN(String POLICY_COLUMN) {
        this.POLICY_COLUMN = POLICY_COLUMN;
    }

    public String getAUDIT_TRAIL() {
        return AUDIT_TRAIL;
    }

    public void setAUDIT_TRAIL(String AUDIT_TRAIL) {
        this.AUDIT_TRAIL = AUDIT_TRAIL;
    }

    public String getPOLICY_COLUMN_OPTIONS() {
        return POLICY_COLUMN_OPTIONS;
    }

    public void setPOLICY_COLUMN_OPTIONS(String POLICY_COLUMN_OPTIONS) {
        this.POLICY_COLUMN_OPTIONS = POLICY_COLUMN_OPTIONS;
    }
    
}
