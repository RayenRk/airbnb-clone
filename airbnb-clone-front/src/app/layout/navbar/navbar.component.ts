import { Component, OnInit, inject } from '@angular/core';
import { ButtonModule } from 'primeng/button';
import { CategoryComponent } from './category/category.component';
import { AvatarComponent } from './avatar/avatar.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { MenuModule } from 'primeng/menu';
import { ToolbarModule } from 'primeng/toolbar';
import { DialogService } from 'primeng/dynamicdialog';
import { MenuItem } from 'primeng/api';
import { ToastService } from '../toast.service';

@Component({
  selector: 'app-navbar',
  standalone: true,
  imports: [
    FontAwesomeModule,
    ButtonModule,
    ToolbarModule,
    MenuModule,
    CategoryComponent,
    AvatarComponent,
  ],
  providers: [DialogService],
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.scss',
})
export class NavbarComponent implements OnInit {
  constructor() {}

  location = 'Anywhere';
  guests = 'Add guests';
  dates = 'Any week';

  toastService = inject(ToastService);

  //login () => this.authService.login();
  //logout () => this.authService.logout();

  currentMenuItems: MenuItem[] | undefined = [];

  ngOnInit(): void {
    this.currentMenuItems = this.fetchMenu();
    this.toastService.send({severity: "info", summary: "Welcome to your airbnb app!"});
  }
  private fetchMenu() {
    return [
      {
        label: "Sign up",
        styleClass: "font-bold"
      },
      {
        label: "Log in",
      }
    ]
  }
}
