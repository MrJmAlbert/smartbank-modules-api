package com.axess.smartbankapi.controller;

import java.time.LocalDateTime;
import java.util.List;

import com.axess.smartbankapi.dto.CCUserDto;
import com.axess.smartbankapi.exception.RecordExistException;
import com.axess.smartbankapi.exception.RecordNotCreatedException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axess.smartbankapi.config.restapi.ApiSuccessResponse;
import com.axess.smartbankapi.dto.LoginDto;
import com.axess.smartbankapi.exception.RecordNotFoundException;
import com.axess.smartbankapi.model.CCUser;
import com.axess.smartbankapi.service.CCUserService;

@RestController
@RequestMapping("/cc-user")
@CrossOrigin
public class CCUserController {
	
	@Autowired
	private CCUserService ccUserService;

	
	@PostMapping("/login")
	public ResponseEntity<?> verifyLogin(@RequestBody LoginDto loginDto) throws RecordNotFoundException {
		
		ApiSuccessResponse response = new ApiSuccessResponse();

		// Login
		CCUser loggedInUser = this.ccUserService.getLoginDetails(loginDto.getUserId(), loginDto.getPassword());

		response.setMessage("Login Verified successfully. " );
		response.setHttpStatus(String.valueOf(HttpStatus.FOUND));
		response.setHttpStatusCode(200);
		response.setBody(loggedInUser);
		response.setError(false);
		response.setSuccess(true);

		return ResponseEntity.status(HttpStatus.OK).header("status", String.valueOf(HttpStatus.OK))
				.body(response);

	}
	
	@GetMapping("/get-all-users")
	public ResponseEntity<?> getUsers() throws RecordNotFoundException {
		
		ApiSuccessResponse response = new ApiSuccessResponse();

		List<CCUser> users = this.ccUserService.getAllUsers();

		response.setMessage("No. Of users -  "+users.size() );
		response.setHttpStatus(String.valueOf(HttpStatus.FOUND));
		response.setHttpStatusCode(302);
		response.setBody(users);
		response.setError(false);
		response.setSuccess(true);

		return ResponseEntity.status(HttpStatus.OK).header("status", String.valueOf(HttpStatus.OK))
				.body(response);

	}

	@PostMapping("/user-registration")
	public ResponseEntity<ApiSuccessResponse> save(@RequestBody CCUserDto dto) throws RecordNotCreatedException, RecordExistException {
		ApiSuccessResponse response = new ApiSuccessResponse();

		if(dto != null){
			CCUser user = null;
			BeanUtils.copyProperties(dto,user);
			String userName = ccUserService.saveUser(user);

			response.setMessage("User registrated -  "+ userName );
			response.setHttpStatus(String.valueOf(HttpStatus.CREATED));
			response.setHttpStatusCode(200);
			response.setBody(user);
			response.setError(false);
			response.setSuccess(true);

			return ResponseEntity.status(HttpStatus.OK).header("status", String.valueOf(HttpStatus.OK))
					.body(response);
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).header("status", String.valueOf(HttpStatus.BAD_REQUEST))
				.body(response);





	}

}
