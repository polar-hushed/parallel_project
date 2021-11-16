package com.tavant.Demo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
	public static void main(String args[])
		throws IOException
	{

		BufferedReader sc = new BufferedReader(
			new InputStreamReader(System.in));
		String name = "";
		int pass_code;
		int ac_no;
		int ch;

		while (true) {
			//System.out.println(
				//"\n ---------------Project Bank App-----------------\n");
			System.out.println("----------------------1)New user Account");
			System.out.println("----------------------2)Existing Account");

			try {
				System.out.print("\nEnter Input:"); //user input
				ch = Integer.parseInt(sc.readLine());

				switch (ch) {
				case 1:
					try {
						System.out.print(
							"Enter UserName:");
						name = sc.readLine();
						System.out.print(
							"Enter Password:");
						pass_code = Integer.parseInt(
							sc.readLine());

						if (banking.createAccount(
								name, pass_code)) {
							System.out.println(
								"Account Created\n");
						}
						else {
							System.out.println(
								"Failed!\n");
						}
					}
					catch (Exception e) {
						System.out.println(
							" Insertion Failed!\n");
					}
					break;

				case 2:
					try {
						System.out.print(
							"Enter UserName:");
						name = sc.readLine();
						System.out.print(
							"Enter Password:");
						pass_code = Integer.parseInt(
							sc.readLine());

						if (banking.loginAccount(
								name, pass_code)) {
							System.out.println(
								"Logout\n");
						}
						else {
							System.out.println(
								" login Failed!\n");
						}
					}
					catch (Exception e) {
						System.out.println(
							"  Login Failed!\n");
					}

					break;

				default:
					System.out.println("Invalid Entry!\n");
				}

				if (ch == 3) {
					System.out.println(
						"Exited");
					break;
				}
			}
			catch (Exception e) {
				System.out.println("Enter Valid Entry!");
			}
		}
		sc.close();
	}
}
