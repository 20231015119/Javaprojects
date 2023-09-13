/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relation_operational_example3.java;

/**
 *
 * @author Estudiantes
 */
public class Relation_Operational_Example3Java {
    public static void main(String[] args){
    double recommendedWaterIntake = 8;
      double daysInChallenge = 30;
      double yourWaterIntake = 235.5;
      double totalRecommendedAmount = recommendedWaterIntake*daysInChallenge;
      boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
      System.out.println(isChallengeComplete);
    }
    
}
