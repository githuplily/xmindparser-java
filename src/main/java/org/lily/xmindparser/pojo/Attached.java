/**
  * Copyright 2020 bejson.com 
  */
package org.lily.xmindparser.pojo;
import lombok.Data;

import java.util.List;

/**
 * Auto-generated: 2020-03-24 11:24:27
 * 
 */
@Data
public class Attached {

    private String id;
    private String title;
    private Notes notes;
    private List<Comments> comments;
    private List<Markers> markers;
    private Children children;
    private List<String> labels;


}