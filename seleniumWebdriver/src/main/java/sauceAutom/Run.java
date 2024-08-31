package sauceAutom;

import java.util.concurrent.TimeUnit;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		Verify_login k = new Verify_login();
		k.verify_login();
		TimeUnit.SECONDS.sleep(4);
		Login n = new Login();
		n.login();
		
		TimeUnit.SECONDS.sleep(4);
		Add_to_cart t = new Add_to_cart();
		t.Add_to_cart1();
		TimeUnit.SECONDS.sleep(4);
		Order h = new Order();
		h.order();
		TimeUnit.SECONDS.sleep(4);
		Logout g  = new Logout();
		g.logout();

		/*
		 * Numerous_users l = new Numerous_users(); l.more_users();
		 */
	}
	}


