package com.voterapp.main;

import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;
import com.voterapp.exception.VoterIdNotFoundException;
import com.voterapp.service.ElectionBoothImpl;
import com.voterapp.service.IElectionBooth;

public class Voter {

	public static void main(String[] args) {
	
		IElectionBooth electionBooth = new ElectionBoothImpl();
		try{
			boolean isEligible = electionBooth.checkEligibility(18, "JP Nagar", 1001);
			if(isEligible)
				System.out.println("You are eligble to vote");
		}catch(UnderAgeException | LocalityNotFoundException | VoterIdNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(NotEligibleException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
