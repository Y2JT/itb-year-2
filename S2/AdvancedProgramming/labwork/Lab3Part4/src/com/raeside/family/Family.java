package com.raeside.family;


import java.util.Vector;

import com.raeside.family.exceptions.FirstNameExistsException;
import com.raeside.family.exceptions.SurnameMismatchException;

public class Family {

		private Vector familyMembers = new Vector();
		private String familyName;
		
		public Family(String familyName) {
			this.familyName = familyName;
		}
		
		public void addFamilyMember(Person member) throws FirstNameExistsException, SurnameMismatchException {
			
			if(newFirstName(member.getFirstName())) {
				if(correctFamilyName(member.getFamilyName()))
					familyMembers.addElement(member);
				else{
					throw new SurnameMismatchException("You must have surname " + familyName + " to join this family");
				}
			}
			else {	
				throw new FirstNameExistsException("This family already has a " + member.getFirstName());
			}
		}
		
		public String[] getFamilyMembers() {
			
			String[] names=new String[familyMembers.size()];
			
			for(int i=0; i < familyMembers.size(); i++) {
				names[i]=((Person)familyMembers.elementAt(i)).getFirstName() + " " + ((Person)familyMembers.elementAt(i)).getFamilyName();
			}
			return names;
		}
		
		public boolean newFirstName(String firstName) {
			
			for(int i=0; i < familyMembers.size(); i++) {
				if(((Person)familyMembers.elementAt(i)).getFirstName().equals(firstName)) {
					return false; //name is not new to the family
				}
			}
			return true; //the name was not found
		}
		
		public boolean correctFamilyName(String familyName) {
			
			if(familyName.equals(this.familyName)) {
				return true; //family name is correct
			}
			return false; //person's family name doesnot match
			
		}
}