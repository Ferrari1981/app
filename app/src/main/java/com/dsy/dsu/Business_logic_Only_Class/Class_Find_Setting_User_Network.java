package com.dsy.dsu.Business_logic_Only_Class;

import android.content.Context;
import android.database.sqlite.SQLiteCursor;
import android.util.Log;

public class Class_Find_Setting_User_Network {

    Context contextДляКлассаПроверкаУстановкиПользователяРежимРаботыСети;
    /////

    CREATE_DATABASE Create_Database_СсылкаНАБазовыйКласс;

    public Class_Find_Setting_User_Network(Context context) {

        contextДляКлассаПроверкаУстановкиПользователяРежимРаботыСети=context;

        ///////TODO
         Create_Database_СсылкаНАБазовыйКласс=new CREATE_DATABASE(contextДляКлассаПроверкаУстановкиПользователяРежимРаботыСети);
    }
    //функция получающая время операции ДАННАЯ ФУНКЦИЯ ВРЕМЯ ПРИМЕНЯЕТЬСЯ ВО ВСЕЙ


    public boolean МетодПроветяетКакуюУстановкуВыбралПользовательСети() {

        boolean РезультатСтоитЗапускатьСинхрониазциюЛилНетПоРезультаттВыбраныхнастроиеПользователя = false;


        //////////////////////

        String РезутьтатПроверкиТипПодключениякИнтернетуWIFIИЛИMOBILEиВзависимостиЧтоВыбралВНастройкаПользовательПринимаемРешение = new String();

        try {

     /////todo тут МЫ ПОЛУЧАЕМ В КАКОЙ МОМЕНТ ТИП ПОДКЛЮЧЕНИЯ НА ТЕЛЕФОНЕ МОБИЛЯ ИЛИ  WIFI  И В ЗАВИСИМОСТИ ЧТОБЫ ПОНЯТЬ ЧЕ ЗА ДЕЛА
     РезутьтатПроверкиТипПодключениякИнтернетуWIFIИЛИMOBILEиВзависимостиЧтоВыбралВНастройкаПользовательПринимаемРешение
             = new Class_Type_Connenction_Tel(contextДляКлассаПроверкаУстановкиПользователяРежимРаботыСети).МетодОпределяемКакойТипПодключениеWIFIилиMobile();


     //////
     Log.d(this.getClass().getName(), "   РезутьтатПроверкиТипПодключениякИнтернету " + РезутьтатПроверкиТипПодключениякИнтернетуWIFIИЛИMOBILEиВзависимостиЧтоВыбралВНастройкаПользовательПринимаемРешение);


     // TODO: 02.09.2021 код НАЧАЛО  посика как в телфоне написано режим подключениея к интрениту


     /////TODO ТУТ ПОЛУЧАЕМ  ЗНАЧЕНИЯ ПО УМОЛЧАНИЮ ПРОГРАММЫ РЕЖИМ РАБОТИЫ СИНХРОНИЗАЦИИ ТОЛЬКО ПО  WIFI
     ////
     Class_GRUD_SQL_Operations class_grud_sql_operationsГлавныйСинхронизацииДанныхКлиентСервер = new Class_GRUD_SQL_Operations(contextДляКлассаПроверкаУстановкиПользователяРежимРаботыСети);


     // TODO: 26.08.2021 НОВЫЙ ВЫЗОВ НОВОГО КЛАСС GRUD - ОПЕРАЦИИ

     ///
     class_grud_sql_operationsГлавныйСинхронизацииДанныхКлиентСервер.concurrentHashMapНаборПараментовSQLBuilder_Для_GRUD_Операций.put("НазваниеОбрабоатываемойТаблицы", "SuccessLogin");
     ///////
     class_grud_sql_operationsГлавныйСинхронизацииДанныхКлиентСервер.concurrentHashMapНаборПараментовSQLBuilder_Для_GRUD_Операций.put("СтолбцыОбработки", "mode_connection");




         // TODO: 12.10.2021  Ссылка Менеджер Потоков

            PUBLIC_CONTENT Class_Engine_SQLГдеНаходитьсяМенеджерПотоков = new PUBLIC_CONTENT(contextДляКлассаПроверкаУстановкиПользователяРежимРаботыСети);


     // TODO: 02.09.2021 exe sql

     SQLiteCursor КурсорУзнаемСохраненыйРежимРаботыССетью = (SQLiteCursor) class_grud_sql_operationsГлавныйСинхронизацииДанныхКлиентСервер.
             new GetData(contextДляКлассаПроверкаУстановкиПользователяРежимРаботыСети).getdata(class_grud_sql_operationsГлавныйСинхронизацииДанныхКлиентСервер.concurrentHashMapНаборПараментовSQLBuilder_Для_GRUD_Операций,
             Class_Engine_SQLГдеНаходитьсяМенеджерПотоков.МенеджерПотоков,Create_Database_СсылкаНАБазовыйКласс.getССылкаНаСозданнуюБазу());

     Log.d(this.getClass().getName(), "GetData " + КурсорУзнаемСохраненыйРежимРаботыССетью);






     // TODO: 29.09.2021
     String УстановленныйПользоватлемПолучениыыйВыбраныйПарментУстановленныйПользователемРедимПодключенияССетью = new String();

     if (КурсорУзнаемСохраненыйРежимРаботыССетью.getCount() > 0) {

         Log.d(this.getClass().getName(), "GetData " + КурсорУзнаемСохраненыйРежимРаботыССетью);
         ///
         КурсорУзнаемСохраненыйРежимРаботыССетью.moveToFirst();
         ////////

         УстановленныйПользоватлемПолучениыыйВыбраныйПарментУстановленныйПользователемРедимПодключенияССетью = КурсорУзнаемСохраненыйРежимРаботыССетью.getString(0);

         Log.d(this.getClass().getName(), "КурсорУзнаемСохраненыйРежимРаботыССетью " + КурсорУзнаемСохраненыйРежимРаботыССетью +
                 "  УстановленныйПользоватлемПолучениыыйВыбраныйПарментУстановленныйПользователемРедимПодключенияССетью " + УстановленныйПользоватлемПолучениыыйВыбраныйПарментУстановленныйПользователемРедимПодключенияССетью);


         Log.d(this.getClass().getName(), "РезутьтатПроверкиТипПодключениякИнтернетуWIFIИЛИMOBILEиВзависимостиЧтоВыбралВНастройкаПользовательПринимаемРешение "
                 + РезутьтатПроверкиТипПодключениякИнтернетуWIFIИЛИMOBILEиВзависимостиЧтоВыбралВНастройкаПользовательПринимаемРешение +
                 " ПолучениыыйВыбраныйПарментУстановленныйПользователемРедимПодключенияССетью " + УстановленныйПользоватлемПолучениыыйВыбраныйПарментУстановленныйПользователемРедимПодключенияССетью);


         if (УстановленныйПользоватлемПолучениыыйВыбраныйПарментУстановленныйПользователемРедимПодключенияССетью.
                 equalsIgnoreCase(РезутьтатПроверкиТипПодключениякИнтернетуWIFIИЛИMOBILEиВзависимостиЧтоВыбралВНастройкаПользовательПринимаемРешение) ||


                 УстановленныйПользоватлемПолучениыыйВыбраныйПарментУстановленныйПользователемРедимПодключенияССетью.trim().equalsIgnoreCase("Mobile") ) {

             Log.d(this.getClass().getName(), "РезутьтатПроверкиТипПодключениякИнтернетуWIFIИЛИMOBILEиВзависимостиЧтоВыбралВНастройкаПользовательПринимаемРешение "

                     + РезутьтатПроверкиТипПодключениякИнтернетуWIFIИЛИMOBILEиВзависимостиЧтоВыбралВНастройкаПользовательПринимаемРешение +

                     " УстановленныйПользоватлемПолучениыыйВыбраныйПарментУстановленныйПользователемРедимПодключенияССетью " + УстановленныйПользоватлемПолучениыыйВыбраныйПарментУстановленныйПользователемРедимПодключенияССетью);


             // TODO: 29.09.2021  надо синхрониазциии
             РезультатСтоитЗапускатьСинхрониазциюЛилНетПоРезультаттВыбраныхнастроиеПользователя=true;



// TODO: 29.09.2021  проверяем равны ли выбранный режим с режимо выбранным пользователм
         }else{
// TODO: 29.09.2021  проверяем равны ли выбранный режим с режимо выбранным пользователм
             Log.d(this.getClass().getName(), " СИНХРОНИАЗЦИЯ ОТМЕНЕНА ПОТОМУ ЧТО РЕЖИСЫ РАБОТЫ  ССЕТЬЮ  УСТАНОВЛЕННЕЫЕ ПОЛЬЗОВАТЕЛЕМ И РЕЖИМ УСТАНОВЕОЫЙ НА ТЕЛФОНОНЕ ПО СОВПАДАЮТ " +
                     "утьтатПроверкиТипПодключениякИнтернетуWIFIИЛИMOBILEиВзависимостиЧтоВыбралВНастройкаПользовательПринимаемРешение "
                     + РезутьтатПроверкиТипПодключениякИнтернетуWIFIИЛИMOBILEиВзависимостиЧтоВыбралВНастройкаПользовательПринимаемРешение );

             // TODO: 29.09.2021 не надо синхрониазциии
             РезультатСтоитЗапускатьСинхрониазциюЛилНетПоРезультаттВыбраныхнастроиеПользователя=false;

         }




     } else {

         Log.d(this.getClass().getName(), "КурсорУзнаемСохраненыйРежимРаботыССетью " + КурсорУзнаемСохраненыйРежимРаботыССетью);

         // TODO: 29.09.2021  надо синхрониазциии если нет значений значит это првый запуск
       РезультатСтоитЗапускатьСинхрониазциюЛилНетПоРезультаттВыбраныхнастроиеПользователя=true;
     }




     ///todo публикум название таблицы или цифру его
 } catch (Exception e) {
        //  Block of code to handle errors
        e.printStackTrace();
        ///метод запись ошибок в таблицу
        Log.e(this.getClass().getName(), "Ошибка " + e + " Метод :" + Thread.currentThread().getStackTrace()[2].getMethodName() + " Линия  :"
                + Thread.currentThread().getStackTrace()[2].getLineNumber());
        new   Class_Generation_Errors(contextДляКлассаПроверкаУстановкиПользователяРежимРаботыСети).МетодЗаписиВЖурналНовойОшибки(e.toString(),
                this.getClass().getName(), Thread.currentThread().getStackTrace()[2].getMethodName(),
                Thread.currentThread().getStackTrace()[2].getLineNumber());
    }


        return РезультатСтоитЗапускатьСинхрониазциюЛилНетПоРезультаттВыбраныхнастроиеПользователя;
    }

}
