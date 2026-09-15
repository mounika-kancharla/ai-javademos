package com.voterapp.service;

import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;
import com.voterapp.exception.VoterIdNotFoundException;

public class ElectionBoothImpl implements IElectionBooth{
	
   @Override
public boolean checkEligibility(int age,String locality,long voterId) throws NotEligibleException {
	   if(checkAge(age) && checkLocality(locality) && checkVoterId(voterId))
   return true;
	   return false;
}
   
   
  private boolean checkAge(int age) throws UnderAgeException{
	   //if age is lesser than 18 throw this exception
	  if(age<18) 
		  throw new UnderAgeException("Your are under age");
	  return true;
	  }
   
  private boolean checkLocality(String locality)throws LocalityNotFoundException{
	  //voter should be within locality
	  String[] localities = new String[] {"JP Nagar","Jaya Nagar","Whitefield","Banashankari"};
	  for(String nlocality:localities) {
		  if(locality.equals(nlocality))
	  return true;
  }
	  //if not throw exception
	  throw new LocalityNotFoundException("Your Locality is invalid");
}
  private boolean checkVoterId(long voterId)throws VoterIdNotFoundException{
	  if(voterId>1000 && voterId<10000)
		  return true;
	  throw new VoterIdNotFoundException("invalid voterId");
  }
}

