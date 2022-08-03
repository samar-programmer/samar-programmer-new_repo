package com.enrollment.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="StaffCourseAssign")
public class StaffCourseAssignEntity implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long autoId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id",nullable=false)
	@JsonIgnore
	private StaffAssignEntity staffId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="courseCode",nullable=false)
	@JsonIgnore
	private CourseEntity courseId;
	
	
	
}
