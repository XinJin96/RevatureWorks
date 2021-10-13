package week6exercise;

import java.util.ArrayList;
import java.util.List;

public class exercise {
	public static class Account {
		private long id; 
		private String accountType;
		
		public Account() {}
		
		public Account(long id, String accountType) {
			this.id = id;
			this.accountType = accountType; 
		}
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getAccountType() {
			return accountType;
		}
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		@Override
		public String toString() {
			return "Account [id=" + id + ", accountType=" + accountType + "]";
		}
		public static List<Account> createAccount(int numOfAccounts){
			List<Account> accounts = new ArrayList<>();
			for (int i = 0; i<numOfAccounts; i++) {
				if(Math.random()>.5) {
					accounts.add(new Account(i,"checking"));
				}else {
					accounts.add(new Account(i, "savings"));
				}
			}
			return accounts;
		}
	}
}
