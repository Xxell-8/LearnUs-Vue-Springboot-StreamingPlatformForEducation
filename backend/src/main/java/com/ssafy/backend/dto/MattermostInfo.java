package com.ssafy.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MattermostInfo {
    private int mattermostId;
    private int ordinalNo;
    private String webhook;
    private String name;
    private String pathName;
    private List<Track> trackList;
}
