package org.mdz.bavarikon.eventbrowser.model.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "status")
public class StatusEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String chain;
  private String step;
  private String itemId;
  private String itemState;
  private String detail;
  private Integer numba;
  private Long daet;
  private String msgType;
  private Long execId;

  public StatusEntity() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getChain() {
    return chain;
  }

  public void setChain(String chain) {
    this.chain = chain;
  }

  public String getStep() {
    return step;
  }

  public void setStep(String step) {
    this.step = step;
  }

  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public String getItemState() {
    return itemState;
  }

  public void setItemState(String itemState) {
    this.itemState = itemState;
  }

  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public Integer getNumba() {
    return numba;
  }

  public void setNumba(Integer numba) {
    this.numba = numba;
  }

  public Long getDaet() {
    return daet;
  }

  public void setDaet(Long daet) {
    this.daet = daet;
  }

  public String getMsgType() {
    return msgType;
  }

  public void setMsgType(String msgType) {
    this.msgType = msgType;
  }

  public Long getExecId() {
    return execId;
  }

  public void setExecId(Long execId) {
    this.execId = execId;
  }

  @Override
  public String toString() {
    return "StatusEntity{"
        + "id="
        + id
        + ", chain='"
        + chain
        + '\''
        + ", step='"
        + step
        + '\''
        + ", itemId='"
        + itemId
        + '\''
        + ", itemState='"
        + itemState
        + '\''
        + ", detail='"
        + detail
        + '\''
        + ", numba="
        + numba
        + ", daet="
        + daet
        + ", msgType='"
        + msgType
        + '\''
        + ", execId="
        + execId
        + '}';
  }
}
