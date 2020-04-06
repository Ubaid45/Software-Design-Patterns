package com.practice.behaviroal.patterns.mediator.normalWay;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
  protected DialogBox owner;

  public UIControl(DialogBox owner){
    this.owner = owner;
  }
}
