package com.example.springapp.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Myresume")
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ResumeId;
    private String name;
    private String jobTitle;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact", referencedColumnName = "contactId")
    private ContactDetails contact;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ug", referencedColumnName = "id")
    private UgEducation ug;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hsc", referencedColumnName = "id")
    private HscEducation hsc;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sslc", referencedColumnName = "id")
    private SslcEducation sslc;

}
