package com.main.Entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Accounts")
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotEmpty
	@Column(columnDefinition = "nvarchar(50)")
	private String username;

	@NotEmpty
	@Column(columnDefinition = "nvarchar(50)")
	private String password;

	@NotEmpty
	@Column(columnDefinition = "nvarchar(50)")
	private String fullname;

	@NotEmpty
	@Email
	@Column(columnDefinition = "nvarchar(50)")
	private String email;

	private String photo;
	private Boolean activated;
	private Boolean admin;
	@OneToMany(mappedBy = "account")
	private List<Order> orders;

}