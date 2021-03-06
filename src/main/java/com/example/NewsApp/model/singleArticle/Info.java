package com.example.NewsApp.model.singleArticle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Info {
	
	private String id;
	private String title;
	private String rightcol;
	private String announce;
	private Long modified;

}
