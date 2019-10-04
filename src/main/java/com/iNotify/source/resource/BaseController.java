/**
 * 
 */
package com.iNotify.source.resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iNotify.source.model.NotifyVO;

/**
 * @author Manoj Fernando A
 *
 */

@RestController
//without this also its working fine when accessing from angular
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/notify")
public class BaseController {

	@GetMapping("/getNotifyList")
	public List<NotifyVO> getNotifyList(){
		NotifyVO v1 = new NotifyVO();
		v1.setNotifyId(1);
		v1.setNotificationnName("Birthday");
		v1.setDescription("This is my birthday");
		v1.setReminderDate(new Date());
		
		List<NotifyVO> list = new ArrayList<NotifyVO>();
		list.add(v1);
		
		return list;
	}
}
