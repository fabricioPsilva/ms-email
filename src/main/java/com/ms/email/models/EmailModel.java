package com.ms.email.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long emailId;
	private String ownerRef; // id do usuário
	private String emailFrom;
	private String emailTo;
	private String subject; // titulo do email
	@Column(columnDefinition = "TEXT") // columnDefinition do tipo text exclui o limite de caracteres a salvar no banco
	private String text;
	private LocalDateTime sendDateEmail;

}
