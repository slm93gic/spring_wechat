package com.shenlimin.wechat.entity.menu;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Button {

    private List<AbstractButton> button = new ArrayList<>();

}
