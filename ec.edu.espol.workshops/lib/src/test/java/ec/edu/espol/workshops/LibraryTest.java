/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package ec.edu.espol.workshops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

class LibraryTest {
  
	//TEST-ID: T-001
  @Test void ageInputTest() {
	  Assertions.assertEquals(CarInsurance.checkAgeInput("5"), 5);//CASE-ID: T001-C01
	  Assertions.assertEquals(CarInsurance.checkAgeInput("0"), -1);//CASE-ID: T001-C02
	  Assertions.assertEquals(CarInsurance.checkAgeInput("-5"), -1);//CASE-ID: T001-C03
	  Assertions.assertEquals(CarInsurance.checkAgeInput("A~*BC"), -1);//CASE-ID: T001-C04
	  Assertions.assertEquals(CarInsurance.checkAgeInput("2.5"), -1);//CASE-ID: T001-C05
	  Assertions.assertEquals(CarInsurance.checkAgeInput("-2.5"), -1);//CASE-ID: T001-C06
  }

  //TES-ID: T-002
  @Test void genreInputTest() {
	  Assertions.assertEquals(CarInsurance.checkGenreInput("M"), 'M');//CASE-ID: T002-C01
	  Assertions.assertEquals(CarInsurance.checkGenreInput("F"), 'F');//CASE-ID: T002-C02
	  Assertions.assertEquals(CarInsurance.checkGenreInput("m"), 'M');//CASE-ID: T002-C03
	  Assertions.assertEquals(CarInsurance.checkGenreInput("f"), 'F');//CASE-ID: T002-C04
	  Assertions.assertEquals(CarInsurance.checkGenreInput("A"), null);//CASE-ID: T002-C05
	  Assertions.assertEquals(CarInsurance.checkGenreInput("a"), null);//CASE-ID: T002-C06
	  Assertions.assertEquals(CarInsurance.checkGenreInput("Mbcd"), null);//CASE-ID: T002-C07
	  Assertions.assertEquals(CarInsurance.checkGenreInput("mbcd"), null);//CASE-ID: T002-C08
	  Assertions.assertEquals(CarInsurance.checkGenreInput("Fbcd"), null);//CASE-ID: T002-C09
	  Assertions.assertEquals(CarInsurance.checkGenreInput("fbcd"), null);//CASE-ID: T002-C10
	  Assertions.assertEquals(CarInsurance.checkGenreInput("Abcd"), null);//CASE-ID: T002-C11
	  Assertions.assertEquals(CarInsurance.checkGenreInput("abcd"), null);//CASE-ID: T002-C12
  }
  
  //TEST-ID: T-003
  @Test void yesNoInputTest() {
	  Assertions.assertEquals(CarInsurance.checkYesNoInput("S"), true);//CASE-ID: T003-C01
	  Assertions.assertEquals(CarInsurance.checkYesNoInput("N"), false);//CASE-ID: T003-C02
	  Assertions.assertEquals(CarInsurance.checkYesNoInput("s"), true);//CASE-ID: T003-C03
	  Assertions.assertEquals(CarInsurance.checkYesNoInput("n"), false);//CASE-ID: T003-C04
	  Assertions.assertEquals(CarInsurance.checkYesNoInput("A"), null);//CASE-ID: T003-C05
	  Assertions.assertEquals(CarInsurance.checkYesNoInput("a"), null);//CASE-ID: T003-C06
	  Assertions.assertEquals(CarInsurance.checkYesNoInput("Sbcd"), null);//CASE-ID: T003-C07
	  Assertions.assertEquals(CarInsurance.checkYesNoInput("sbcd"), null);//CASE-ID: T003-C08
	  Assertions.assertEquals(CarInsurance.checkYesNoInput("Nccd"), null);//CASE-ID: T003-C09
	  Assertions.assertEquals(CarInsurance.checkYesNoInput("nbcd"), null);//CASE-ID: T003-C10
	  Assertions.assertEquals(CarInsurance.checkYesNoInput("Abcd"), null);//CASE-ID: T003-C11
	  Assertions.assertEquals(CarInsurance.checkYesNoInput("abcd"), null);//CASE-ID: T003-C12
  }
 
  //TEST-ID: T-004
  @Test void computePremiumTest() {
	  CarInsurance myInsurance = new CarInsurance();
	  
	  myInsurance.setAll(23, 'M', true);
	  Assertions.assertEquals(myInsurance.computePremium(),(500-200));//CASE-ID: T004-C01
	  myInsurance.setAll(23, 'M', false);
	  Assertions.assertEquals(myInsurance.computePremium(),(500+1500));//CASE-ID: T004-C02
	  myInsurance.setAll(23, 'F', true);
	  Assertions.assertEquals(myInsurance.computePremium(),(500-200));//CASE-ID: T004-C03
	  myInsurance.setAll(23, 'F', false);
	  Assertions.assertEquals(myInsurance.computePremium(),(500-200));//CASE-ID: T004-C04
	  
	  myInsurance.setAll(30, 'M', true);
	  Assertions.assertEquals(myInsurance.computePremium(),(500-200));//CASE-ID: T004-C05
	  myInsurance.setAll(30, 'M', false);
	  Assertions.assertEquals(myInsurance.computePremium(),(500));//CASE-ID: T004-C06
	  myInsurance.setAll(30, 'F', true);
	  Assertions.assertEquals(myInsurance.computePremium(),(500-200));//CASE-ID: T004-C07
	  myInsurance.setAll(30, 'F', false);
	  Assertions.assertEquals(myInsurance.computePremium(),(500-200));//CASE-ID: T004-C08
	  
	  myInsurance.setAll(50, 'M', true);
	  Assertions.assertEquals(myInsurance.computePremium(),(500-200-100));//CASE-ID: T004-C09
	  myInsurance.setAll(50, 'M', false);
	  Assertions.assertEquals(myInsurance.computePremium(),(500-100));//CASE-ID: T004-C10
	  myInsurance.setAll(50, 'F', true);
	  Assertions.assertEquals(myInsurance.computePremium(),(500-200-100));//CASE-ID: T004-C11
	  myInsurance.setAll(50, 'F', false);
	  Assertions.assertEquals(myInsurance.computePremium(),(500-200-100));//CASE-ID: T004-C12
	  
	  myInsurance.setAll(70, 'M', true);
	  Assertions.assertEquals(myInsurance.computePremium(),(500-200));//CASE-ID: T004-C13
	  myInsurance.setAll(70, 'M', false);
	  Assertions.assertEquals(myInsurance.computePremium(),(500));
	  myInsurance.setAll(70, 'F', true);
	  Assertions.assertEquals(myInsurance.computePremium(),(500-200));//CASE-ID: T004-C14
	  myInsurance.setAll(70, 'F', false);
	  Assertions.assertEquals(myInsurance.computePremium(),(500-200));//CASE-ID: T004-C15
	  
	  myInsurance.setAll(81, 'M', true);
	  Assertions.assertEquals(myInsurance.computePremium(),-1);//CASE-ID: T004-C16
	  myInsurance.setAll(81, 'M', false);
	  Assertions.assertEquals(myInsurance.computePremium(),-1);//CASE-ID: T004-C17
	  myInsurance.setAll(81, 'F', true);
	  Assertions.assertEquals(myInsurance.computePremium(),-1);//CASE-ID: T004-C18
	  myInsurance.setAll(81, 'F', false);
	  Assertions.assertEquals(myInsurance.computePremium(),-1);//CASE-ID: T004-C19
	  
  }
  
  
}
