package com.billzard.ws.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.context.ApplicationContext;

import com.billzard.dao.HotSpotDetailsDAO;
import com.billzard.util.AppContextUtil;
import com.billzard.vo.input.HotSpotDetailsVO;
import com.billzard.vo.output.ResultVO;

@Path(value = "/customer")
public class CustomerService {

	@POST
	@Path("/save")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response printMssg(HotSpotDetailsVO detailsVO) {
		ApplicationContext applicationContext = new AppContextUtil()
				.setConfigFiles().buildContext();
		/*HotSpotDetailsVO hotSpotVO = new HotSpotDetailsVO();
		hotSpotVO.setEmailId("a@b.com");
		hotSpotVO.setMobile("100000000");
		hotSpotVO.setCoordinates("1.234,1.324");
		hotSpotVO.setHotspotName("Auchan");
		hotSpotVO.setIsPublic(false);
		hotSpotVO.setStrength("8");*/
		HotSpotDetailsDAO hotSpotDAO = (HotSpotDetailsDAO) applicationContext
				.getBean("hotSpotDao");
		hotSpotDAO.save(detailsVO);
		return Response.status(200)
				.entity(new ResultVO(200, "Success").toString()).build();
	}
	
	@POST
	@Path("/create")
	public Response createCustomer(){
		return null;
	}
	
	@GET
	@Path("/getCustomer")
	public Response getCustomer(){
		return null;
	}
	
	@GET
	@Path("/getCustomerPurchases")
	public Response getCustomerPurchaseDetails(){
		return null;
	}

}
