# پیام رسان قزمیت :)

## گام اول

## گام دوم

تغییرات گام اول در جدول زیر قابل مشاهده می‌باشد:

<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>اضافه کردن مدل پیام‌رسانی تلگرام</p>
</td>
<td width="292">
<p>
پیام تلگرام که در آن شناسه‌ مبدا و مقصد به همراه تابع‌های
getter و
setter
پیاده‌سازی شده‌ است.
</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۲</strong></p>
</td>
<td width="198">
<p>MessageService</p>
</td>
<td width="141">
<p>افزودن اینترفیس ارسال پیام</p>
</td>
<td width="292">
<p>
افزودن تابع
SendTelegramMessage
به
interface
</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۳</strong></p>
</td>
<td width="198">
<p>TelegramMessageService</p>
</td>
<td width="141">
<p>پیاده سازی تابع ارسال پیام برای تلگرام</p>
</td>
<td width="292">
<p>
پیاده‌اسزی تابع ارسال پیام که در آن اطلاعات طرفین و محتویات پیام چاپ می‌شود.
</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۴</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>
اضافه کردن ارسال پیام از طریق سامانه تلگرام
</p>
</td>
<td width="292">
<p>
کاربر با ارسال عدد ۳ می‌تواند از سامانه‌ی تلگرامی برای ارسال پیام خود استفاده کند. در این پیاده‌سازی از کاربر شناسه‌ی مبدا و مقصد و محتویات پیام پرسیده می‌شود.
</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۵</strong></p>
</td>
<td width="198">
<p>SmsMessageService</p>
</td>
<td width="141">
<p>اورراید کردن تلگرام سرویس با بدنه خالی
</p>
</td>
<td width="292">
<p>
بده خالی است
</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۶</strong></p>
</td>
<td width="198">
<p>EmailMessageService</p>
</td>
<td width="141">
<p>اورراید کردن تلگرام سرویس با بدنه خالی
</p>
</td>
<td width="292">
<p>
بدنه خالی است
</p>
</td>
</tr>

</tbody>
</table>

مجموع تعداد تغییرات: 6


## گام سوم

در این قسمت قصد داریم تا با بررسی اصول SOLID تغییرات ایجاد شده در قسمت قبل را بررسی و تحلیل کنیم.

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>
ایجاد اینترفیس برای سرویس‌ها و مجزا بودن هر سرویس قابلیت گسترش سرویس‌ها و تغییر هریک را به صورت مستقل فراهم می‌سازد.
</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>
پیاده‌سازی انجام شده قاعده 
close to modification
به درستی انجام نشده چرا که ایجاد سرویس جدید نیاز به ایجاد تغییرات اضافی در دیگر کلاس‌ها می‌باشد.
</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>
استفاده از MessageService برای هندل کردن هر نوع سرویس.
</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>
با توجه به جداسازی وظایف در کلاس‌های پیام‌رسانی مختلف، اصل جداسازی واسط به خوبی رعایت شده است.
</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>
تمام سرویس‌ها وابسته به توابع ارسال پیامی هستند که به آن وابسته نمی‌باشند.
</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>
وابستگی کلاس‌های اصلی به واسط MessageService (به جای کلاس‌های پیام‌رسانی خاص) به خوبی رعایت شده است، که موجب افزایش انعطاف‌پذیری و قابلیت تست برنامه می‌شود.
</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>
در تابع Main لازم است تا پیاده‌سازی هریک از سرویس‌ها به طور مجزا 
import 
شود که ناقض این اصل است.
</p>
</td>
</tr>
</tbody>
</table>
