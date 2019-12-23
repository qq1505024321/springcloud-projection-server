package com.jk.controller;

import com.jk.model.Houseinfo;
import com.jk.service.HouseSevice;
import com.jk.util.ExportExcel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class HouseController {

    @Autowired
    private HouseSevice houseSevice;

    @RequestMapping("queryHouseInfo")
    @ResponseBody
    public Map<String,Object> queryHouseInfo(Integer page, Integer limit, Houseinfo houseinfo){

        return houseSevice.queryHouseInfo(page,limit,houseinfo);
    }

    @RequestMapping("export")
    public void export(HttpServletResponse response){
        List<Houseinfo> list= new ArrayList<Houseinfo>();
        try {
            list = houseSevice.queryHouseInfo1();

            //定义表格的标题
            String title ="小蜗房源信息";
            //定义列名
            String[] rowName={"编号","地址","所在小区","描述","价格/日","房东名称","类型","床类型","出租方式"};
            //定义工具类要的数据
            List<Object[]>  dataList = new ArrayList<Object[]>();

            //循环数据把数据存放到 List<Object[]>
            for (Houseinfo house:list) {
                Object[] obj=new Object[rowName.length];
                obj[0]=house.getHoseid();
                obj[1]= house.getHouseadderss();
                obj[2]=house.getHousenam();
                obj[3]=house.getHouseshow();
                obj[4]=house.getDayprice();
                obj[5]=house.getUsername();
                obj[6]=house.getHousetypes();
                obj[7]=house.getBedtypename();
                obj[8]=house.getLeasetypes();



                dataList.add(obj);
            }
            ExportExcel exportExcel=new ExportExcel(title,rowName,dataList,response);
            exportExcel.export();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*@RequestMapping("importExcel")
    public String importExcel(MultipartFile file, HttpServletResponse response){
        //上传文件的名称
        String fileName = file.getOriginalFilename();
        //生成新的文件名称
        String filePath = "./src/main/resources/templates/fileupload/";

        //创建list集合接收传递的参数
        List<Houseinfo> list= new ArrayList<Houseinfo>();

        //上传文件
        try {
            uploadFile(file.getBytes(), filePath, fileName);

            //通过文件创建流
            FileInputStream fileInputStream = new FileInputStream(filePath+fileName);
            //创建操作excel的对象   因为xls的文件需要HSSFWorkbook  xlsx需要的XSSFWorkbook 因此直接使用workBook对象就行了
            Workbook workbook= WorkbookFactory.create(fileInputStream) ;
            //通过workbook获得sheet页  sheet有可能有多个
            for(int i=0;i<workbook.getNumberOfSheets();i++){
                //创建sheet对象
                Sheet sheetAt = workbook.getSheetAt(i);
                //根绝sheet创建行  row
                for(int j=3;j<sheetAt.getPhysicalNumberOfRows();j++){
                    //创建row对象
                    Row row = sheetAt.getRow(j);

                    //创建对象接收从文件读取的内容
                    Houseinfo house=new Houseinfo();
                    if( !"".equals(row.getCell(1)) && row.getCell(1)!=null){
                        house.setHouseadderss(row.getCell(1).toString());
                    }
                    if( !"".equals(row.getCell(2)) && row.getCell(2)!=null){
                        house.setHousenam(row.getCell(2).toString());
                    }
                    if( !"".equals(row.getCell(3)) && row.getCell(3)!=null){
                        house.setHouseshow(row.getCell(3).toString());
                    }
                    if( !"".equals(row.getCell(4)) && row.getCell(4)!=null){
                        house.setUsername(row.getCell(4).toString());
                    }
                    if( !"".equals(row.getCell(5)) && row.getCell(5)!=null){
                        house.setHousetypes(row.getCell(5).toString());
                    }
                    if( !"".equals(row.getCell(6)) && row.getCell(6)!=null){
                        house.setBedtypename(row.getCell(6).toString());
                    }
                    if( !"".equals(row.getCell(7)) && row.getCell(7)!=null){
                        house.setLeasetypes(row.getCell(7).toString());
                    }
                    list.add(house);
                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return "show";
    }



    //上传文件的方法
    public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath + fileName);
        out.write(file);
        out.flush();
        out.close();
    }*/
}
